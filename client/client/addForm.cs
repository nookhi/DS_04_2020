using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Runtime.Remoting;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;
using server2;

namespace client
{
    public partial class addForm : Form
    {
        SushiRolls sushi = null;

        public addForm()
        {
            InitializeComponent();
        }
  

        private void hScrollBar1_Scroll(object sender, ScrollEventArgs e)
        {
            label4.Text = hScrollBar1.Value.ToString();
        }

        private void addForm_Load(object sender, EventArgs e)
        {
            comboBox1.SelectedIndex = 0;
        }

        private void hScrollBar2_Scroll(object sender, ScrollEventArgs e)
        {
            label6.Text = hScrollBar2.Value.ToString();
        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }
        private void button1_Click(object sender, EventArgs e)
        {

            if (radioButton1.Checked)

            {

                sushi = new SushiRolls(comboBox1.SelectedItem.ToString(), Convert.ToInt32(numericUpDown1.Value), hScrollBar1.Value, hScrollBar2.Value);

            }

            else

            {

                sushi = new SushiRolls();

                sushi.setName(comboBox1.SelectedItem.ToString());

                sushi.setQuantity(Convert.ToInt32(numericUpDown1.Value));

                sushi.setWeight(hScrollBar1.Value);

                sushi.setPrice(hScrollBar2.Value);

            }
            this.Close();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }
        public SushiRolls getSushi
        {
            get
            {
                return sushi;
            }
        }
    }
}
