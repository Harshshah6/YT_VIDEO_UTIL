# YT_VIDEO_UTIL
An Library helps to get / extract the information of youtube video..... This library is free to use for lifetime to paying needed.

 [![](https://jitpack.io/v/Harshshah6/YT_VIDEO_UTIL.svg)](https://jitpack.io/#Harshshah6/YT_VIDEO_UTIL)
 [![](https://jitpack.io/v/Harshshah6/YT_VIDEO_UTIL/week.svg)](httls://jitpack.io/#Harshshah6/YT_VIDEO_UTIL/week.svg)
 [![](https://jitpack.io/v/Harshshah6/YT_VIDEO_UTIL/month.svg)](httls://jitpack.io/#Harshshah6/YT_VIDEO_UTIL/month.svg)
 
 [![](https://repository-images.githubusercontent.com/530299726/354e9b8e-b555-4609-b00c-1c871a2144ef)](https://repository-images.githubusercontent.com/530299726/354e9b8e-b555-4609-b00c-1c871a2144ef)
 
 ### Configure
 ### Maven
 ##### Step 1. Add the JitPack repository to your build file
   Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 
 
 #### Step 2. Add the dependency:
 
 ```
 dependencies {
     implementation 'com.github.Harshshah6:YT_VIDEO_UTIL:1.0'
} ```java
	

#### Getting Types
- GetViews
- GetTitle
- GetThumbnail(link)
- GetDescription
- GetVideoDownloadingLinks/Size(ArrayList<HashMap<String, Object>>)
- GetAudioDownloadingLinks/Size(ArrayList<HashMap<String, Object>>)
- GetAuthor
- GetAuthorChannelId
- GetVideoLength
- GetTags
- _getMessage <- used to get error or to get whole source in json format

#### VideoDownloading
- 144p
- 240p
- 360p
- 480p
- 720p
- 1080p

#### AudioDownloading
- mp3(low quality-low size)
- mp3(high quality-huge size)

## Usage
[Usages](https://github.com/Harshshah6/YT_VIDEO_UTIL/blob/master/Documentation/Usage.md)
