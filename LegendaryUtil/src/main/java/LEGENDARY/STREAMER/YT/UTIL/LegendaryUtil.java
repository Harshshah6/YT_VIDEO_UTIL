package LEGENDARY.STREAMER.YT.UTIL;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.ArrayList;
import org.json.*;
import LEGENDARY.STREAMER.YT.UTIL.LegendaryListener;
import LEGENDARY.STREAMER.YT.UTIL.RequestNetwork;

public class LegendaryUtil {
    
    private Context my_context;
    private String _API = "71fead9c94msh5a4c1d369f75f11p147f4cjsn5ae5f776fdf5";
    private RequestNetwork rn;
    private RequestNetwork.RequestListener rn_listener;
    private LegendaryListener listener;
    private HashMap<String,Object> tMap;
    private HashMap<String,Object> header_map;
    private static ArrayList<HashMap<String,Object>> dataMp4 = new ArrayList<>();
    private static ArrayList<HashMap<String,Object>> dataMp3 = new ArrayList<>();
    
    public static String _title ="LEGENDARY STREAMER";
    public static String _description = "LEGENDARY STREAMER";
    public static String _tags = "LEGENDARY,STREAMER";
    public static String _thumbnail = "";
    public static String _author = "LEGENDARY STREAMER";
     public static String _length = "0:00";
     public static String _authorchannelid = "UCM47cB8057ryDSQ9HSzoavA";
     public static String _views = "0";
     public static String _keywords = "LEGENDARY,STREAMER";
    
    public LegendaryUtil(Context _context){
        this.my_context = _context;
        //this.setApi("71fead9c94msh5a4c1d369f75f11p147f4cjsn5ae5f776fdf5");
    
    this.rn = new RequestNetwork((Activity)my_context);
    rn_listener = new RequestNetwork.RequestListener(){
        
        @Override
        public void onResponse(String _var1,String _var2,HashMap<String,Object>hashmap){
            //--
            dataMp3.clear();
            dataMp4.clear();
            _response_to_var(_var2);
            //LegendaryUtil.this.listener.onSuccess(_var2);
            //++
        };
        
        public void onErrorResponse(String _var1,String _var2){
            String var_mssg = "";
            try{
                JSONObject o1 = new JSONObject(_var2);
                var_mssg=o1.getString("message");
            }catch(Exception e){
                var_mssg = _var2;
            }
            
            LegendaryUtil.this.listener.onFail(var_mssg);
        }
    };
    }
    
    public void setVideoUri(String _url){
        
        String vUrl = _url;
        String object = "https://youtube-video-download-info.p.rapidapi.com/dl?id=";
object = object.concat(getVideoid(vUrl));

        this.header_map = new HashMap<>();
        this.header_map.put("X-RapidAPI-Key",this._API);
        this.header_map.put("X-RapidAPI-Host","youtube-video-download-info.p.rapidapi.com");
        this.rn.setHeaders(this.header_map);
  
  rn.startRequestNetwork(RequestNetworkController.GET, object,"", rn_listener);

    }
    
    private void _response_to_var(final String _response){
        //--
        try{
            JSONObject r1 = new JSONObject(_response);
            this._title = r1.getString("title");
        }catch(Exception e){
            this._title = e.getMessage();
        }
        
        try{
            JSONObject r1 = new JSONObject(_response);
            this._description = r1.getString("description");
        }catch(Exception e){
            this._description = e.getMessage();
        }
        
        try{
            JSONObject r1 = new JSONObject(_response);
            this._tags = r1.getString("keywords");
        }catch(Exception e){
            this._tags = e.getMessage();
        }
        
        try{
            JSONObject r1 = new JSONObject(_response);
            this._thumbnail = r1.getString("thumb");
        }catch(Exception e){
            this._thumbnail = e.getMessage();
        }
        
        try{
            JSONObject r1 = new JSONObject(_response);
            this._author = r1.getString("author");
        }catch(Exception e){
            this._author = e.getMessage();
        }
        
        try{
            JSONObject r1 = new JSONObject(_response);
            this._length = r1.getString("length");
        }catch(Exception e){
            this._length = e.getMessage();
        }
        
        try{
            JSONObject r1 = new JSONObject(_response);
            this._authorchannelid = r1.getString("channelid");
        }catch(Exception e){
            this._authorchannelid = e.getMessage();
        }
        
        try{
            JSONObject r1 = new JSONObject(_response);
            this._views = r1.getString("view_count");
        }catch(Exception e){
            this._views = e.getMessage();
        }
        
        try {
			JSONObject o1 = new JSONObject(_response);
			
			JSONObject o2 = o1.getJSONObject("link");
			
			JSONArray v8 = o2.getJSONArray("160");
			
			addPositionMp4(v8.getString(0),v8.getString(1));
			
		} catch (Exception e) {
		
		}
		try {
			JSONObject o1 = new JSONObject(_response);
			
			JSONObject o2 = o1.getJSONObject("link");
			
			JSONArray v3 = o2.getJSONArray("133");
			
			addPositionMp4(v3.getString(0),v3.getString(1));
			
		} catch (Exception e) {
			
		}
		try {
			JSONObject o1 = new JSONObject(_response);
			
			JSONObject o2 = o1.getJSONObject("link");
			
			JSONArray v1 = o2.getJSONArray("18"); 
			addPositionMp4(v1.getString(0),v1.getString(1));
			
		} catch (Exception e) {
			
		}
		try {
			JSONObject o1 = new JSONObject(_response);
			
			JSONObject o2 = o1.getJSONObject("link");
			
			JSONArray v5 = o2.getJSONArray("135");
			addPositionMp4(v5.getString(0),v5.getString(1));
			
		} catch (Exception e) {
			
		}
		try {
			JSONObject o1 = new JSONObject(_response);
			
			JSONObject o2 = o1.getJSONObject("link");
			
			JSONArray v6 = o2.getJSONArray("136");
			addPositionMp4(v6.getString(0),v6.getString(1));
			
		} catch (Exception e) {
			
		}
		try {
			JSONObject o1 = new JSONObject(_response);
			
			JSONObject o2 = o1.getJSONObject("link");
			
			JSONArray v7 = o2.getJSONArray("137");
			addPositionMp4(v7.getString(0),v7.getString(1));
			
		} catch (Exception e) {
			
		}
        
        try {
			JSONObject o1 = new JSONObject(_response);
			
			JSONObject o2 = o1.getJSONObject("link");
			JSONArray s1 = o2.getJSONArray("139");
			addPositionMp3(s1.getString(0),s1.getString(1));
			
		} catch (Exception e) {
			
		}
		try {
			JSONObject o1 = new JSONObject(_response);
			
			JSONObject o2 = o1.getJSONObject("link");
			JSONArray s2 = o2.getJSONArray("140");
			addPositionMp3(s2.getString(0),s2.getString(1));
			
		} catch (Exception e) {
			
		}
        
        //++
        LegendaryUtil.this.listener.onSuccess(_response);
    }
    
    private void addPositionMp4(String _url,String _size){
        this.tMap = new HashMap<>();
        this.tMap.put("link",_url);
        this.tMap.put("size",_size);
        this.dataMp4.add(this.tMap);
    }
    
    private void addPositionMp3(String _url, String _size){
        this.tMap = new HashMap<>();
        this.tMap.put("link",_url);
        this.tMap.put("size",_size);
        this.dataMp3.add(this.tMap);
    }
    
    public static ArrayList<HashMap<String,Object>> getMP4(){
        return dataMp4;
    }
    
    public static ArrayList<HashMap<String,Object>> getMP3(){
        return dataMp3;
    }
    
    public void ReqListener(LegendaryListener listener){
        this.listener = listener;
    }
    
    private String getVideoid(String _url){
        if(_url.contains("https://youtu.be/")){
    String UUrl = _url;
    UUrl = UUrl.replace("https://youtu.be/","");
    return UUrl;
         }else{
             return "";
         }
    }
    
    public static String getTitle(){
        return _title;
    }
    
    public static String getDescription(){
        return _description;
    }
    
    public static String getThumb(){
        return _thumbnail;
    }
    
    public static String getViews(){
        return _views;
    }
    
    public static String getAuthor(){
        return _author;
    }
    
    public static String getVideoLength(){
        return _length;
    }
    
    public static String getChannelid(){
        return _authorchannelid;
    }
    
}
