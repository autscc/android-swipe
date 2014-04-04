package swipe.profissional;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Class that represents the message fragment.
 * 
 * @author Alysson Tiago S. Cordeiro
 * 
 * @version 1.0
 * 
 */
public class FragmentMessage extends Fragment {

	/**Attributes that represent the components of the layout of this fragment*/
	private TextView textViewId;
	private TextView textViewText;
	
	/**
	 * Required empty public constructor.
	 */
	public FragmentMessage() {
		
	}
	
	/**
	 * Method executed when the fragment starts.
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		/*Loading layout fragment*/
		View v = inflater.inflate(R.layout.fragment_message, container, false);
	     
		textViewId = (TextView) v.findViewById(R.id.textViewId);
		textViewText = (TextView) v.findViewById(R.id.textViewText);
		
		/*Recovering the arguments (parameters) of the fragment. Sent from MainActivity activity.*/
		Bundle bundle = getArguments();
		int id = bundle.getInt("id");
		String texto = bundle.getString("text");
			
		textViewId.setText(String.valueOf(id));
		textViewText.setText(texto);
		
		/*Return view*/
		return v;
	}
	
}


	

