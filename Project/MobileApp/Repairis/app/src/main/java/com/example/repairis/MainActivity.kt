package com.example.repairis

import android.os.Handler
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import com.viewpagerindicator.CirclePageIndicator

import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult
import com.facebook.login.LoginManager
import android.widget.Button
import android.widget.Toast
import com.facebook.login.widget.LoginButton
import android.content.pm.PackageManager
import android.content.pm.PackageInfo
import android.util.Base64
import android.util.Log
import com.facebook.*
import org.json.JSONObject
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.*


class MainActivity : AppCompatActivity() {
    private var imageModelArrayList: ArrayList<ImageModel>? = null

    private val myImageList = intArrayOf(R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.grab)

    private AQuery aQuery;
    private ImageView ivpic;
    private TextView tvdetails;
    private CallbackManager callbackManager;
    private AccessTokenTracker accessTokenTracker;
    private ProfileTracker profileTracker;
    private LoginButton loginButton;
    private FacebookCallback&lt;LoginResult&gt; callback = new FacebookCallback&lt;LoginResult&gt;() {
        @Override
        public void onSuccess(LoginResult loginResult) {
            GraphRequest request = GraphRequest.newMeRequest(
                    loginResult.getAccessToken(),
            new GraphRequest.GraphJSONObjectCallback() {
                @Override
                public void onCompleted(JSONObject object, GraphResponse response) {
                Log.v("LoginActivity", response.toString());

                // Application code
                try {
                    Log.d("tttttt",object.getString("id"));
                    String birthday="";
                    if(object.has("birthday")){
                        birthday = object.getString("birthday"); // 01/31/1980 format
                    }

                    String fnm = object.getString("first_name");
                    String lnm = object.getString("last_name");
                    String mail = object.getString("email");
                    String gender = object.getString("gender");
                    String fid = object.getString("id");
                    tvdetails.setText("Name: "+fnm+" "+lnm+" \n"+"Email: "+mail+" \n"+"Gender: "+gender+" \n"+"ID: "+fid+" \n"+"Birth Date: "+birthday);
                    aQuery.id(ivpic).image("https://graph.facebook.com/" + fid + "/picture?type=large");
                    //https://graph.facebook.com/143990709444026/picture?type=large
                    Log.d("aswwww","https://graph.facebook.com/"+fid+"/picture?type=large");

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
            });
            Bundle parameters = new Bundle();
            parameters.putString("fields", "id, first_name, last_name, email, gender, birthday, location");
            request.setParameters(parameters);
            request.executeAsync();

        }

        @Override
        public void onCancel() {

        }

        @Override
        public void onError(FacebookException error) {

        }
    };


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FacebookSdk.sdkInitialize(getApplicationContext())
        AppEventsLogger.activateApp(this)
        setContentView(R.layout.activity_main)
        imageModelArrayList = ArrayList()
        imageModelArrayList = populateList()

        init()

                        dialog.show()
                    }

//                protected override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
//                    callbackManager.onActivityResult(requestCode, resultCode, data)
//                    super.onActivityResult(requestCode, resultCode, data)
//                }
                })
            try {
                val info = packageManager.getPackageInfo(
                    PackageManager.GET_SIGNATURES
                )
                for (signature in info.signatures) {
                    val md = MessageDigest.getInstance("SHA")
                    md.update(signature.toByteArray())
                    Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT))
                }
            } catch (e: PackageManager.NameNotFoundException) {

            } catch (e: NoSuchAlgorithmException) {

            }
            val accessToken = AccessToken.getCurrentAccessToken()
            val isLoggedIn = accessToken != null && !accessToken.isExpired
            LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile"));
        }

    }

    private fun populateList(): ArrayList<ImageModel> {

        val list = ArrayList<ImageModel>()

        for (i in 0..5) {
            val imageModel = ImageModel()
            imageModel.setImage_drawables(myImageList[i])
            list.add(imageModel)
        }

        return list
    }

    private fun init() {

        mPager = findViewById(R.id.pager) as ViewPager
        mPager!!.adapter = SlidingImage_Adapter(this@MainActivity, this.imageModelArrayList!!)

        val indicator = findViewById(R.id.indicator) as CirclePageIndicator

        indicator.setViewPager(mPager)

        val density = resources.displayMetrics.density

        //Set circle indicator radius
        indicator.setRadius(5 * density)

        NUM_PAGES = imageModelArrayList!!.size

        // Auto start of viewpager
        val handler = Handler()
        val Update = Runnable {
            if (currentPage == NUM_PAGES) {
                currentPage = 0
            }
            mPager!!.setCurrentItem(currentPage++, true)
        }
        val swipeTimer = Timer()
        swipeTimer.schedule(object : TimerTask() {
            override fun run() {
                handler.post(Update)
            }
        }, 3000, 3000)

        // Pager listener over indicator
        indicator.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageSelected(position: Int) {
                currentPage = position

            }

            override fun onPageScrolled(pos: Int, arg1: Float, arg2: Int) {

            }

            override fun onPageScrollStateChanged(pos: Int) {

            }
        })

    }

    companion object {
        private var mPager: ViewPager? = null
        private var currentPage = 0
        private var NUM_PAGES = 0
    }

}