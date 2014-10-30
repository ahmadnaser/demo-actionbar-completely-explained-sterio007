package com.ahmadnaser.actionbar;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;

public class LocationFoundActivity extends Activity {



    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_location_found);
		
		// get the action bar
		ActionBar actionBar = getActionBar();
		
		// Enabling Back navigation on Action Bar icon
		actionBar.setDisplayHomeAsUpEnabled(true);
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //using xml

        //creates a menu inflater
        MenuInflater inflater = getMenuInflater();
        //generates a Menu from a menu resource file
        //R.menu.main_menu represents the ID of the XML resource file
        inflater.inflate(R.menu.main_not_used, menu);



        /*
        //the menu option text is defined in resources
        menu.add(R.string.aboutOption);

        //get a SubMenu reference
        SubMenu sm = menu.addSubMenu("Options...");
        //add menu items to the submenu
        sm.add("Theme");
        sm.add("Settings");

        //it is better to use final variables for IDs than constant values
        //menu.add(Menu.NONE,1,Menu.NONE,"Exit");

        //get the MenuItem reference
        MenuItem item =
                menu.add(Menu.NONE,1,Menu.NONE,R.string.exitOption);

        item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

               finish();
                return true;
            }
        });
        //set the shortcut
              item.setShortcut('5', 'x');

        //the menu option text is defined as constant String
        menu.add("Restart");
*/
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        //check selected menu item
        // R.id.exit is @+id/exit
        if(item.getItemId() == R.id.exit){
            //close the Activity
            this.finish();
            return true;
        }
        return false;
    }
}
