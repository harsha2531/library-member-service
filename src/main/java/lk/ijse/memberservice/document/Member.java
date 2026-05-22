package lk.ijse.memberservice.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "members")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    private String id;
    private String name;
    private String email;
    private String membershipType;
}
