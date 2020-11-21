package com.example.wallpapersandbackgroundclone.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

import com.example.wallpapersandbackgroundclone.Adapters.GridAdapter;
import com.example.wallpapersandbackgroundclone.Adapters.UserClass;
import com.example.wallpapersandbackgroundclone.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryImageActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserClass userClass;
    private List<UserClass> flowerList;
    private List<UserClass> greenHouseList;
    private List<UserClass> glassList;
    private List<UserClass> greekList;
    private List<UserClass> modenArList;
    private List<UserClass> archedMetalList;
    private List<UserClass> historicMinesList;
    private List<UserClass> monumentsList;
    private List<UserClass> residencesList;
    private List<UserClass> iceList;
    private List<UserClass> roadsList;
    private List<UserClass> insectsList;
    private NetworkInfo info;
    private GridAdapter gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_image);
        recyclerView = findViewById(R.id.recyclerView);

        flowerList = new ArrayList<>();

        greenHouseList = new ArrayList<>();

        glassList = new ArrayList<>();

        modenArList = new ArrayList<>();

        archedMetalList = new ArrayList<>();

        historicMinesList = new ArrayList<>();

        greekList = new ArrayList<>();

        monumentsList = new ArrayList<>();

        residencesList = new ArrayList<>();

        iceList = new ArrayList<>();

        roadsList = new ArrayList<>();

        insectsList = new ArrayList<>();

        ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(CONNECTIVITY_SERVICE);
        info = cm.getActiveNetworkInfo();
        if (info != null) {
            Toast.makeText(CategoryImageActivity.this, "Loading..", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "No Internet Connection!", Toast.LENGTH_LONG).show();
        }

        //flowerList add data
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/341970/pexels-photo-341970.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/2106037/pexels-photo-2106037.jpeg"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/2058498/pexels-photo-2058498.jpeg"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/3014941/pexels-photo-3014941.jpeg"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/1187079/pexels-photo-1187079.jpeg"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/757889/pexels-photo-757889.jpeg"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/128868/thimble-common-foxglove-digitalis-purpurea-cinquefoil-128868.jpeg"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/414949/pexels-photo-414949.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/1386604/pexels-photo-1386604.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/1382734/pexels-photo-1382734.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/1253718/pexels-photo-1253718.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/532168/pexels-photo-532168.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/1466813/pexels-photo-1466813.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/4055759/pexels-photo-4055759.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/1381679/pexels-photo-1381679.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        flowerList.add(new UserClass("flower","https://images.pexels.com/photos/1381679/pexels-photo-1381679.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));

        //greenHouseList add data
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1518994603110-1912b3272afd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1573143033275-0c49551f5788?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1566218246241-934ad8b38ea6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1530889282687-ee74a940194c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1553492272-2e81b465c82a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1524070960420-47602852d30f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1508277119692-771239379ff9?ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1542615843-fd415054983e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1574611643461-53ab2c5608b4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1598022991864-b988e475a650?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1584977232403-86416457bb97?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1538250186714-fe613be88381?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1579297600037-5df6e356898d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1579461455266-4f1dc8adb88d?ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1579461454716-23426cddf321?ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1592112500306-32f94fd365b4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1583672288592-c7934be5faa6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1542328116-ef89f89159ac?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1582758054019-6e219958f733?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1578530138177-d75eed152821?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greenHouseList.add(new UserClass("greenHouse","https://images.unsplash.com/photo-1518994603110-1912b3272afd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));

        //glassList add data
        glassList.add(new UserClass("glass","https://images.pexels.com/photos/1156684/pexels-photo-1156684.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        glassList.add(new UserClass("glass","https://images.unsplash.com/photo-1576005623432-b77544a9e8b2?ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80%20334w,%20"));
        glassList.add(new UserClass("glass","https://images.unsplash.com/photo-1515694346937-94d85e41e6f0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80%20334w,%20"));
        glassList.add(new UserClass("glass","https://images.unsplash.com/photo-1553880414-5fe13d83ddb6?ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80"));
        glassList.add(new UserClass("glass","https://images.unsplash.com/photo-1490351267196-b7a67e26e41b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        glassList.add(new UserClass("glass","https://images.unsplash.com/photo-1588250674913-e28f0351f855?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        glassList.add(new UserClass("glass","https://images.unsplash.com/photo-1553880414-5fe13d83ddb6?ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80"));
        glassList.add(new UserClass("glass","https://images.unsplash.com/photo-1512511708753-3150cd2ec8ee?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        glassList.add(new UserClass("glass","https://images.unsplash.com/photo-1588867702719-969c8ac733d6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        glassList.add(new UserClass("glass","https://images.unsplash.com/photo-1567705323043-d0e489de300d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        glassList.add(new UserClass("glass","https://images.unsplash.com/photo-1483094035713-218a81c0d971?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        glassList.add(new UserClass("glass","https://images.unsplash.com/photo-1513304455487-653082b2ab81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        glassList.add(new UserClass("glass","https://images.unsplash.com/photo-1586836101213-22e3497aba78?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        glassList.add(new UserClass("glass","https://images.unsplash.com/photo-1483791424735-e9ad0209eea2?ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80"));

        //modenArList add data
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/1535162/pexels-photo-1535162.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/1236701/pexels-photo-1236701.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/1433052/pexels-photo-1433052.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/1106476/pexels-photo-1106476.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/1380653/pexels-photo-1380653.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/1029611/pexels-photo-1029611.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/3172740/pexels-photo-3172740.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/1769356/pexels-photo-1769356.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/1974596/pexels-photo-1974596.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/1886516/pexels-photo-1886516.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/2400547/pexels-photo-2400547.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/3126553/pexels-photo-3126553.png?auto=compress&cs=tinysrgb&h=750&w=1260"));
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/2276927/pexels-photo-2276927.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        modenArList.add(new UserClass("modenAr","https://images.pexels.com/photos/2276927/pexels-photo-2276927.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));

        //archedMetalList add data
        archedMetalList.add(new UserClass("archedMetal","https://images.unsplash.com/photo-1570107867379-80aacd934826?ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80"));
        archedMetalList.add(new UserClass("archedMetal","https://images.unsplash.com/photo-1564161911440-ef0baaf49d9a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        archedMetalList.add(new UserClass("archedMetal","https://images.unsplash.com/photo-1559043347-c83ab7f011e5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        archedMetalList.add(new UserClass("archedMetal","https://images.unsplash.com/photo-1516327179756-685570635144?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        archedMetalList.add(new UserClass("archedMetal","https://images.unsplash.com/photo-1559043346-84f7964efe3f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        archedMetalList.add(new UserClass("archedMetal","https://images.unsplash.com/photo-1597309544535-fbf1f687d0c5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        archedMetalList.add(new UserClass("archedMetal","https://images.unsplash.com/photo-1560069120-1f288a75cb58?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        archedMetalList.add(new UserClass("archedMetal","https://images.unsplash.com/photo-1560069120-1f288a75cb58?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));


        //historicMinesList add data
        historicMinesList.add(new UserClass("historicMines","https://images.unsplash.com/photo-1578804376914-6d367cd21488?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        historicMinesList.add(new UserClass("historicMines","https://images.unsplash.com/photo-1599389932245-f414c9576ab4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        historicMinesList.add(new UserClass("historicMines","https://images.unsplash.com/photo-1570979871946-286d0de9c356?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        historicMinesList.add(new UserClass("historicMines","https://images.unsplash.com/photo-1529797228130-fe918ce6d915?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        historicMinesList.add(new UserClass("historicMines","https://images.unsplash.com/photo-1562167055-1afdc7ac7bca?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        historicMinesList.add(new UserClass("historicMines","https://images.unsplash.com/photo-1567366010418-a999de023da6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        historicMinesList.add(new UserClass("historicMines","https://images.unsplash.com/photo-1530424257364-cd52a3e9bd40?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        historicMinesList.add(new UserClass("historicMines","https://images.unsplash.com/photo-1530424257364-cd52a3e9bd40?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));

        //greekList add data
        greekList.add(new UserClass("greek","https://images.unsplash.com/photo-1533105079780-92b9be482077?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjY1MDE0fQ&auto=format&fit=crop&w=1000&q=80"));
        greekList.add(new UserClass("greek","https://images.unsplash.com/photo-1533104816931-20fa691ff6ca?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greekList.add(new UserClass("greek","https://images.unsplash.com/photo-1506929562872-bb421503ef21?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greekList.add(new UserClass("greek","https://images.unsplash.com/photo-1523568129082-a8d6c095638e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greekList.add(new UserClass("greek","https://images.unsplash.com/photo-1523568129082-a8d6c095638e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greekList.add(new UserClass("greek","https://images.unsplash.com/photo-1559026330-32ecf951bfad?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greekList.add(new UserClass("greek","https://images.unsplash.com/photo-1534695215921-52f8a19e7909?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        greekList.add(new UserClass("greek","https://images.unsplash.com/photo-1534695215921-52f8a19e7909?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));


        //monumentsList add data
        monumentsList.add(new UserClass("monuments","https://images.unsplash.com/photo-1558613326-98af85b75ec9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        monumentsList.add(new UserClass("monuments","https://images.unsplash.com/photo-1551899892-56314e56f2c8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        monumentsList.add(new UserClass("monuments","https://images.unsplash.com/photo-1568503445916-aad26dad82ea?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        monumentsList.add(new UserClass("monuments","https://images.unsplash.com/photo-1587999315543-f7afbdc664dd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        monumentsList.add(new UserClass("monuments","https://images.unsplash.com/photo-1558617354-a066aca172a2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        monumentsList.add(new UserClass("monuments","https://images.unsplash.com/photo-1570444024005-ab4268355612?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        monumentsList.add(new UserClass("monuments","https://images.unsplash.com/photo-1584340042988-d60044065e42?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        monumentsList.add(new UserClass("monuments","https://images.unsplash.com/photo-1584340042988-d60044065e42?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));


        //residencesList add data
        residencesList.add(new UserClass("residences","https://images.unsplash.com/photo-1564892105007-5d140ccf9409?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        residencesList.add(new UserClass("residences","https://images.unsplash.com/photo-1584813913373-2287ad0cac01?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        residencesList.add(new UserClass("residences","https://images.unsplash.com/photo-1584813820873-441c3b75a88f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        residencesList.add(new UserClass("residences","https://images.unsplash.com/photo-1584813913369-a6ca5844f3da?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        residencesList.add(new UserClass("residences","https://images.unsplash.com/photo-1584813913372-be62cea35dcd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        residencesList.add(new UserClass("residences","https://images.unsplash.com/photo-1584813913372-be62cea35dcd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));

        //iceList add data
        iceList.add(new UserClass("ice","https://images.pexels.com/photos/1366919/pexels-photo-1366919.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"));
        iceList.add(new UserClass("ice","https://images.unsplash.com/photo-1548097160-627fd636ee56?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        iceList.add(new UserClass("ice","https://images.unsplash.com/photo-1516575448682-93a05df8bf59?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        iceList.add(new UserClass("ice","https://images.unsplash.com/photo-1543470388-80a8f5281639?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        iceList.add(new UserClass("ice","https://images.unsplash.com/photo-1505015353489-1759d3cc24e2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        iceList.add(new UserClass("ice","https://images.unsplash.com/photo-1515545109095-cf8abbc557f3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        iceList.add(new UserClass("ice","https://images.unsplash.com/photo-1549598685-0058b114c9d6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        iceList.add(new UserClass("ice","https://images.unsplash.com/photo-1478265409131-1f65c88f965c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));

        //roadsList add data
        roadsList.add(new UserClass("roads","https://images.unsplash.com/photo-1470089504205-f6ece216c2f5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        roadsList.add(new UserClass("roads","https://images.unsplash.com/photo-1494822493217-c9840aba840c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        roadsList.add(new UserClass("roads","https://images.unsplash.com/photo-1543997385-22fe0f397eeb?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        roadsList.add(new UserClass("roads","https://images.unsplash.com/photo-1478059299873-f047d8c5fe1a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        roadsList.add(new UserClass("roads","https://images.unsplash.com/photo-1515445702422-3a80ccfdb236?ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80"));
        roadsList.add(new UserClass("roads","https://images.unsplash.com/photo-1500530855697-b586d89ba3ee?ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80"));


        //insectsList add data
        insectsList.add(new UserClass("insects","https://images.unsplash.com/photo-1533048324814-79b0a31982f1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        insectsList.add(new UserClass("insects","https://images.unsplash.com/photo-1551089868-d350fcd2d907?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        insectsList.add(new UserClass("insects","https://images.unsplash.com/photo-1598942524834-2ceb5407d43a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        insectsList.add(new UserClass("insects","https://images.unsplash.com/flagged/photo-1593001030751-a96ea072f1d1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        insectsList.add(new UserClass("insects","https://images.unsplash.com/photo-1591193149781-25e69bef1aff?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        insectsList.add(new UserClass("insects","https://images.unsplash.com/photo-1598545850141-7fdfa6a7957a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        insectsList.add(new UserClass("insects","https://images.unsplash.com/photo-1591613544479-2ca2d6f85e79?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));
        insectsList.add(new UserClass("insects","https://images.unsplash.com/photo-1527078093906-98dd5e50c66b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80"));

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        gridAdapter = new GridAdapter(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("EXTRA_NAME");

            if (value.equals("flower")){
                getdata();
            }
            if (value.equals("greenHouse")){
                getGreenHouse();
            }
            if (value.equals("glass")){
                getGlass();
            }
            if (value.equals("greek")){
                getGreek();
            }
            if (value.equals("modenAr")){
                getModernART();
            }
            if (value.equals("archedMetal")){
                getArchedMetal();
            }
            if (value.equals("historicMines")){
                getHistoricMines();
            }
            if (value.equals("monuments")){
                getMonuments();
            }
            if (value.equals("residences")){
                getResidences();
            }
            if (value.equals("ice")){
                getIce();
            }
            if (value.equals("roads")){
                getRoads();
            }
            if (value.equals("insects")){
                getInsects();
            }
        }
    }

    private void getdata() {
        gridAdapter.setListImage(flowerList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getGreenHouse(){
        gridAdapter.setListImage(greenHouseList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getGlass(){
        gridAdapter.setListImage(glassList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getGreek(){
        gridAdapter.setListImage(greekList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getModernART(){
        gridAdapter.setListImage(modenArList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getArchedMetal(){
        gridAdapter.setListImage(archedMetalList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getHistoricMines(){
        gridAdapter.setListImage(historicMinesList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getMonuments(){
        gridAdapter.setListImage(monumentsList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getResidences(){
        gridAdapter.setListImage(residencesList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getIce(){
        gridAdapter.setListImage(iceList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getRoads(){
        gridAdapter.setListImage(roadsList);
        recyclerView.setAdapter(gridAdapter);
    }
    private void getInsects(){
        gridAdapter.setListImage(insectsList);
        recyclerView.setAdapter(gridAdapter);
    }
}