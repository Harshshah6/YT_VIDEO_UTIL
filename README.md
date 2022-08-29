# YT_VIDEO_UTIL
An Library helps to get / extract the information of youtube video..... This library is free to use for lifetime to paying needed.
 [![](https://jitpack.io/v/abodinagdat16/FileWareUtils.svg)](https://jitpack.io/#abodinagdat16/FileWareUtils)
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
 
 
 #### Step 2. Add the dependency
 
 dependencies {
 
	           implementation 'com.github.abodinagdat16:FileWareUtils:v1.0.0'
         
	}

#### Getting Types
- GetViews
- GetTitle
- GetThumbnail(link)
- GetDescription
- GetVideoDownloadingLinks/Size(List map)
- GetAudioDownloadingLinks/Size(List Map)
- GetAuthor
- GetAuthorChannelId
- GetVideoLength
- GetTags
- _getMessage block used to get error or to get whole source in json format

#### VideoDownloading
144p
240p
360p
480p
720p
1080p

#### AudioDownloading
mp3(low quality-low size)
mp3(high quality-huge size)

## Usage
[Usages]()