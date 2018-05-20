package id.sch.smktelkom_mlg.tugas01.xirpl308.hitungenergipotensial;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.CloseKeyboardAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Arthur Muntu Untu on 8 Feb 2018.
 */

public class EspressoTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void TestHasil() {
        Espresso.onView(withId(R.id.etmassa))
                .perform(typeText("5"));
        Espresso.onView(withId(R.id.etgravitasi))
                .perform(typeText("10"));
        Espresso.onView(withId(R.id.ettinggi))
                .perform(typeText("10"));
        Espresso.onView(withId(R.id.bbutton))
                .perform(new CloseKeyboardAction())
                .perform(ViewActions.click());
        Espresso.onView(withId(R.id.tvhasil))
                .check(ViewAssertions.matches(ViewMatchers.withText("Energi Potensial-nya adalah 500.0 Joule")));
    }
}
