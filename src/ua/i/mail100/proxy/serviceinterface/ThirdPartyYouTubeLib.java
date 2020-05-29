package ua.i.mail100.proxy.serviceinterface;

import ua.i.mail100.proxy.model.Video;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}