package co.com.nequi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {


    public static final Target TEXT_USER= Target.the("Pass textbox").locatedBy("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='person']]");
    public static final Target TEXT_PASS = Target.the("User textbox").locatedBy("//*[@text and @class='android.widget.EditText']");
    public static final Target pas1 = Target.the("bt2").locatedBy("///*[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@text='lock']]]]]]");

    public static final Target ENTRY_BUTTON = Target.the("Entry button").locatedBy("//*[@text='ENTRAR']");
   



    public static final Target pas2 = Target.the("aqui recargas tu cuenta Nequi").locatedBy("//*[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@text='lock']]]]]");
    public static final Target pas3 = Target.the("aqui recargas tu cuenta Nequi").locatedBy("//*[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@text='lock']]]]");
    public static final Target pas4 = Target.the("aqui recargas tu cuenta Nequi").locatedBy("//*[@class='android.view.View' and ./*[@class='android.view.View' and ./*[@text='lock']]]");
    public static final Target pas5 = Target.the("aqui recargas tu cuen").locatedBy("//*[@contentDescription='1']]");

}
//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='person']]