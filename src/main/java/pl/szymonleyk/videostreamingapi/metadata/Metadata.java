package pl.szymonleyk.videostreamingapi.metadata;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.szymonleyk.videostreamingapi.video.Video;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Metadata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
