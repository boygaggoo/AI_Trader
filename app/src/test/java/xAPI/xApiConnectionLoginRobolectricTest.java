package xAPI;

import android.os.Build;
import android.widget.Button;
import android.widget.EditText;

import com.hortensie.ai_trader.R;
import com.hortensie.ai_trader.xAPI.xApiConnectionLogin;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Piotr on 2017-01-02.
 * basic robolectric unit tests to validate
 * 1 - login edit text
 * 2 - password edit text
 * 3 - button to start xApi trading input class
 */

@Config(sdk = Build.VERSION_CODES.LOLLIPOP,manifest = "src/main/AndroidManifest.xml")
@RunWith(RobolectricTestRunner.class)

public class xApiConnectionLoginRobolectricTest {

    private xApiConnectionLogin xApiConnectionLogin;


    @Before
    public void setupActivity(){
        xApiConnectionLogin = Robolectric.setupActivity(xApiConnectionLogin.class);
    }

    @Test
    public void validateLoginEditText(){


        EditText loginEditText = (EditText) xApiConnectionLogin.findViewById(R.id.editTextLogin);
        assertNotNull("EditText could not be found",loginEditText);
        assertTrue("EditText contains incorrect text",
                "10111018".equals(loginEditText.getText().toString()));
    }

    @Test
    public void validatePasswordEditText()
    {
        EditText passwordEditText =(EditText) xApiConnectionLogin.findViewById(R.id.editTextPassword);
        assertNotNull("EditText could not be found",passwordEditText);
        assertTrue("EditText contains incorrect text","9d222175".equals(passwordEditText.getText().toString()));

    }

    @Test
    public void validateClickButtonToGetText()
    {
        Button connection = (Button)xApiConnectionLogin.findViewById(R.id.buttonLogin);
        connection.performClick();
        EditText loginEditText = (EditText) xApiConnectionLogin.findViewById(R.id.editTextLogin);
        assertNotNull(loginEditText);
    }

}