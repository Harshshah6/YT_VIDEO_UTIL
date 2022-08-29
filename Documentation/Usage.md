# Usage
#### Creating & Defining Util
```java
private LegendaryUtil util_name;

LegendaryUtil util_name = new LegendaryUtil(getApplicationContext());
```

#### Setting Video Uri/Url
```java
util_name.setVideoUri("video_url_here");
```
#### Request Listener
```java
util_name.ReqListener(new LegendaryListener(){
		    @Override
		    public void onSuccess(String _mssg){

                                 //on getting success / all onSuccess Event codes must me placed here
			    }
		
		public void onFail(String _mssg){
				//OnError
                                //_mssg <- returns the error message                              
		}
});
```
## OnSuccess Event Codes for getting all

#### getTitle()
```java
//(returns String)
LegendaryUtil.getTitle()
```
#### getDescription()
```java
//returns String
LegendaryUtil.getDescription()
```

#### getThumbnail (direct URL)
```java
//returns String
LegendaryUtil.getThumb()
```

#### getViews()--[returns view count]
```java
//returns String
LegendaryUtil.getViews()
```

#### getAuthor() -- Uploader Name
```java
//returns String
LegendaryUtil.getAuthor()
```

#### getVideoDuration()
```java
//returns String
LegendaryUtil.getVideoLength()
```

#### getUploaderChannelId()
```java
//returns String
LegendaryUtil.getChannelid()
```

#### getVideoDirectLink (download &....)
```java
//returns ListArray<HashMap<String,Object>>
LegendaryUtil.getMP4()

/* key :-
1. link
2. size
*/
```

#### getAudioDirectLink
```java
//returns ListArray<HashMap<String,Object>>
LegendaryUtil.getMP3()

/* key :-
1. link
2. size
*/
```
