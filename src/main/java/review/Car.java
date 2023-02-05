package review;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor   //works nly for final
@Getter
@Setter
@ToString
@Data    //covers getter., setter, Tostring, @EqualsAndHashCode
public class Car {

    private  String make;
    private int topSpeed;

    private int year;


}
