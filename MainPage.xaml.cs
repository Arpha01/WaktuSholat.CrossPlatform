namespace WaktuSholat;

public partial class MainPage : ContentPage
{
	int count = 0;

	public MainPage()
	{
		InitializeComponent();
	}

    private void ContentPage_Loaded(object sender, EventArgs e)
    {
        DisplayAlert("Testing", "OK", "Cancel");
    }
}

