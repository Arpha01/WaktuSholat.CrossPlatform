package crc649606fdd19079428a;


public class PageAdapter
	extends androidx.viewpager2.adapter.FragmentStateAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getItemCount:()I:GetGetItemCountHandler\n" +
			"n_createFragment:(I)Landroidx/fragment/app/Fragment;:GetCreateFragment_IHandler\n" +
			"";
		mono.android.Runtime.register ("Material.Components.Maui.Components.Core.PageAdapter, Material.Components.Maui", PageAdapter.class, __md_methods);
	}


	public PageAdapter (androidx.fragment.app.Fragment p0)
	{
		super (p0);
		if (getClass () == PageAdapter.class) {
			mono.android.TypeManager.Activate ("Material.Components.Maui.Components.Core.PageAdapter, Material.Components.Maui", "AndroidX.Fragment.App.Fragment, Xamarin.AndroidX.Fragment", this, new java.lang.Object[] { p0 });
		}
	}


	public PageAdapter (androidx.fragment.app.FragmentActivity p0)
	{
		super (p0);
		if (getClass () == PageAdapter.class) {
			mono.android.TypeManager.Activate ("Material.Components.Maui.Components.Core.PageAdapter, Material.Components.Maui", "AndroidX.Fragment.App.FragmentActivity, Xamarin.AndroidX.Fragment", this, new java.lang.Object[] { p0 });
		}
	}


	public PageAdapter (androidx.fragment.app.FragmentManager p0, androidx.lifecycle.Lifecycle p1)
	{
		super (p0, p1);
		if (getClass () == PageAdapter.class) {
			mono.android.TypeManager.Activate ("Material.Components.Maui.Components.Core.PageAdapter, Material.Components.Maui", "AndroidX.Fragment.App.FragmentManager, Xamarin.AndroidX.Fragment:AndroidX.Lifecycle.Lifecycle, Xamarin.AndroidX.Lifecycle.Common", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public int getItemCount ()
	{
		return n_getItemCount ();
	}

	private native int n_getItemCount ();


	public androidx.fragment.app.Fragment createFragment (int p0)
	{
		return n_createFragment (p0);
	}

	private native androidx.fragment.app.Fragment n_createFragment (int p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
