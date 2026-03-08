package net.engineeringdigest.journalApp.Entity;

import lombok.*;
import net.engineeringdigest.journalApp.enums.Sentiment;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection =  "journal_entries")
//@Getter
//@Setter
@Data
@NoArgsConstructor
public class JournalEntry {
    @Id
    private ObjectId id;
    @NonNull
    private String title;
    private  String content;

    private LocalDateTime date;

    private Sentiment sentiment;


}
