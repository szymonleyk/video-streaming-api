package pl.szymonleyk.videostreamingapi.metadata;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.szymonleyk.videostreamingapi.video.Video;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Metadata {
    @Id
    private UUID id;
    private String title;
    private String synopsis;
    private String director;
    private int yearOfRelease;
    private String genre;
    private int runningTime;

    @OneToOne
    @JoinColumn(name = "video_id")
    private Video video;
}
