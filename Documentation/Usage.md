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
