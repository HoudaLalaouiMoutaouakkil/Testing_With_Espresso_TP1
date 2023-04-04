package com.example.testing_with_espresso;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;



import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;


import static java.util.regex.Pattern.matches;


@RunWith(AndroidJUnit4.class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExampleInstrumentedTest{
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);
    @Before
    public void setUp() throws Exception {
//Avant l’exécution du cas de test
    }
    @Test
    public void test1ChatId() {
        onView(withId(R.id.textView)).check(matches(isDisplayed()));
    }
    @After
    public void tearDown() throws Exception {
//Après l'exécution du cas de test
    }
}
