package net.engineeringdigest.journalApp.Entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection =  "config_journal_app")
//@Getter
//@Setter
@Data
@NoArgsConstructor
public class ConfigJournalAppEntity {
    private String key;
    private  String value;




}
