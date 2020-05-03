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
namespace client
{
    public partial class addDirectory : Form
    {
        public addDirectory()
        {
            InitializeComponent();
        }
        SushiDirectory sushi = null;

        private void button1_Click(object sender, EventArgs e)
        {
            sushi = new SushiDirectory(textBox1.Text, comboBox1.SelectedItem.ToString(), richTextBox1.Text);
            this.Close();
        }

        private void addDirectory_Load(object sender, EventArgs e)
        {
            comboBox1.SelectedIndex = 0;
        }

        public SushiDirectory getSushi
        {
            get
            {
                return sushi;
            }
        }
    }
}
