using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using server2;

using System.Runtime.Remoting;

using System.Runtime.Remoting.Channels;

using System.Runtime.Remoting.Channels.Tcp;
namespace client
{
    public partial class Directory : Form
    {
        public Directory()
        {
            InitializeComponent();
        }
        SushiOperationDirectory sushid = null;
        TcpClientChannel chan = new TcpClientChannel();
        private void Directory_Load(object sender, EventArgs e)
        {
            try

            {
               

                ChannelServices.RegisterChannel(chan, false);

                sushid = (SushiOperationDirectory)Activator.GetObject(

                typeof(SushiOperationDirectory), "tcp://localhost:9000/sushidirectory");

                output(sushid.getListOfSushiDirectory());

            }

            catch (Exception ex)

            {

                MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);

            }
        }
        private void output(List<server2.SushiDirectory> lstSushi)

        {

            listView1.Items.Clear();

            int i = 1;

            foreach (server2.SushiDirectory sushi in lstSushi)

            {

                ListViewItem newItem = new ListViewItem(i.ToString());

                listView1.Items.Add(newItem);

                newItem.SubItems.Add(sushi.getItemName());

                newItem.SubItems.Add(sushi.getItemType().ToString());

                newItem.SubItems.Add(sushi.getItemDescription());

                i++;

            }

        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (listView1.SelectedIndices.Count < 1)

            {

                MessageBox.Show(this, "Выберите элемент для удаления!", "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);

                return;

            }

            else

            {

                try

                {

                    sushid.deleteSushiDirectory(listView1.SelectedIndices[0]);

                    output(sushid.getListOfSushiDirectory());



                }

                catch (Exception ex)

                {

                    MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);

                }

            }
        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
            ChannelServices.UnregisterChannel(chan);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            addDirectory d = new addDirectory();
            d.ShowDialog();
            if (d.getSushi != null)

            {

                try

                {

                    output(sushid.addNewSushiDirectory(d.getSushi));

                }

                catch (Exception ex)

                {

                    MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);

                }

            }
        }
    }
}
