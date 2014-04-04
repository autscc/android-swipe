package swipe.profissional;

import java.util.ArrayList;
import java.util.List;

import swipe.utils.Message;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;

/**
 * Class that is the main activity of the application.
 * 
 * @author Alysson Tiago Souza Cordeiro
 *
 * @version 1.0
 */
public class MainActivity extends FragmentActivity {

	/*ViewPager*/
	private ViewPager viewPager;

	/*Fragment Adapter*/
	private MyAdapter myAdapter;
	
	/*Collection with messages of example.*/
	private List<Message> messages = new ArrayList<Message>();
	
	/**
	 * Method executed when the activity starts.
	 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        /*Loading layout activity*/       
        setContentView(R.layout.activity_main);
        
        /*Executing  method for creating messages.*/
        createMessages(this.messages);
    	
        /*Instantiating the Adapter*/
        myAdapter = new MyAdapter(getSupportFragmentManager(),messages.size());
        
        /*Forwarding messages to the adapter*/
        myAdapter.addMensagens(messages);
        
        /*ViewPager Layout */
        viewPager = (ViewPager) findViewById(R.id.pager);
        
        /*Assigning Adapter for viewpager*/
        viewPager.setAdapter(myAdapter);
        
        /*Listener for viewpager*/
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			
        	/* This method will be invoked when a new page becomes selected.
        	 * 
        	 * He will be responsible for accessing the adapter and retrieve the fragment and the message the current position.
        	 * */
			@Override
			public void onPageSelected(int numberPager) {				
				myAdapter.getItem(numberPager);
			}
			
			/*This method will be invoked when the current page is scrolled.*/
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				
				/*Creating log in LogCat*/
				Log.i("Position: " ," " + arg0 + " " + arg1 + " " + arg2);
				
			}
			
			/*Called when the scroll state changes.*/
			@Override
			public void onPageScrollStateChanged(int arg0) {
				
				/*Creating log in LogCat*/
				Log.i("State", String.valueOf(arg0));
			}
		});
    }
    
    /*Creating messages of example*/
    private void createMessages(List<Message> messages){
    	Message firstMSG = new Message(1, "Exemple One");
    	Message secondMSG = new Message(2, "Exemple Two");
    	Message thirdMSG = new Message(3, "Exemple Three");
    	Message fourthMSG = new Message(4, "Exemple Four");
    	Message fifthMSG = new Message(5, "Exemple Five");
    	messages.add(firstMSG);
    	messages.add(secondMSG);
    	messages.add(thirdMSG);
    	messages.add(fourthMSG);
    	messages.add(fifthMSG);
    }
}

/**
 * Class for managing fragments.
 * 
 * @author Alysson Tiago Souza Cordeiro
 * 
 * @version 1.0
 */
class MyAdapter extends FragmentPagerAdapter{

	/*Initial number of available fragments*/
	private int num_views = 0;
	
	/*Collection that will receive models messages*/
	private List<Message> messagesFragments = new ArrayList<Message>();
				
	/*Adding posts in collection*/
	public void addMensagens(List<Message> mensagens){
		messagesFragments.addAll(mensagens);
	}

	/*Constructor*/
	public MyAdapter(FragmentManager fm, int num_views) {
		super(fm);
		this.num_views = num_views;
	}

	/**
	 * Returns the fragment of the specified position in the parameter.
	 * 
	 * @param int position -  fragment position
	 * 
	 * @return Fragment - fragment specified. 
	 */
	@Override
	public Fragment getItem(int position) {
		
		/*Creating the fragment (FragmentMessage)*/
		Fragment fragment = new FragmentMessage();	
		
		/*Creating the arguments*/
	    Bundle args = new Bundle();
	    
	    /*Retrieving a message from the current position of the fragment.*/
	    Message message = messagesFragments.get(position);
	    
	    /*Assigning the values ​​of the arguments*/
	    args.putInt("id", message.getId());
	    args.putString("text", message.getMessage());
	    fragment.setArguments(args);
	    
	    /*Return the fragment*/
	    return fragment;
	}
	
	/**
	 * Number of fragments available.
	 * 
	 * @return - number of fragments.
	 */
	@Override
	public int getCount() {
		return num_views;
	}
	
}