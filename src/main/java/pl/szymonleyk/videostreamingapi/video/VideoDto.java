package pl.szymonleyk.videostreamingapi.video;

public record VideoDto(Long id, String content) {
    public static VideoDto from(Video video) {
        return new VideoDto(video.getId(), video.getContent());
    }

    public Video asVideo() {
        return new Video(id, content, null);
    }
}
