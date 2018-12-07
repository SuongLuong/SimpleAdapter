# Tutorial for Simple Adapter in Android

The purpose of this blog is to provide an instrucion on how to use Simple Adapter in an Android project. 

## Introduction

In Android, an adapter is a connection between UI component and data source that helps us to fill data in UI component. We use this adapter to map static data to views defined in an XML file (layout). We can specify the data backing the list as an ArrayList of Maps. Each entry in the ArrayList corresponds to one row in the list. If we need more customization in a ListView or a GridView we need to implement Simple Adapter.

## History

The package library which the component was included in:

android.widget.SimpleAdapter;

android.widget.AdapterView;

The Android system for Simple Adapter: since - Added in API level 1

## Methods

The following is the implementation of a Simple Adapter: public constructor

public SimpleAdapter (Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to)

// Usage for each parameter (retrieved from Android Developer developer.android.com)

- Context: The context where the View associated with this SimpleAdapter is running
- data List: A List of Maps. Each entry in the List corresponds to one row in the list. The Maps contain the data for each row, and should include all the entries specified in "from"
- resource	int: Resource identifier of a view layout that defines the views for this list item. The layout file should include at least those named views defined in "to"
- from	String: A list of column names that will be added to the Map associated with each item.
- to	int: The views that should display column in the "from" parameter. These should all be TextViews. The first N views in this list are given the values of the first N columns in the from parameter.

## Example Project

The major methods used in this project to demonstrate SimpleAdapter usage:

    // create a string for a list of fruit
    String [] fruitsname = {"Mango","Strawberry","Avocado","Orange","Kiwi","Apple","Banana","Papaya"};
    ListView simple_listview;

    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
        for (int i = 0;i<fruitsname.length;i++) {

    // Create this Hashmap to store fruit data in key-value pair
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("name",fruitsname[i]);
            hashMap.put("image",fruitsImages[i]+"");

    // to add the hashmap into arraylist
            arrayList.add(hashMap);
            
            
    // create a simple adapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,arrayList,R.layout.design_file,from,to);
        simple_listview.setAdapter(simpleAdapter);
        
        
## Reference
- These websites are used as reference.
- The sample code on cours website: https://github.com/AustinCENG/Lecture5_ListView

The websites and videos for learning how to use this component:
- YoutubeLinks: https://www.youtube.com/watch?v=nOdSARCVYic
- Android Developer Website: https://developer.android.com/reference/android/widget/SimpleAdapter
- Other websites: https://abhiandroid.com/ui/simpleadapter.html
