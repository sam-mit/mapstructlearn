
import static org.assertj.core.api.Assertions.assertThat;

import com.car.Car;
import com.car.CarDTO;
import com.car.CarMapper;
import com.car.CarType;
import java.util.Arrays;
import org.junit.Test;

public class CarMapperTest {

  @Test
  public void shouldMapCarToDto() {
    //given
    Car car = new Car( "Morris", 5, CarType.SEDAN );
    car.setListOfParts(Arrays.asList("steering", "wheels"));

    //when
    CarDTO carDto = CarMapper.INSTANCE.carToCarDTO( car );

    //then
    assertThat( carDto.getMyCar()).isEqualTo(car);
    assertThat( carDto ).isNotNull();
    assertThat( carDto.getMake() ).isEqualTo( "Morris" );
    assertThat( carDto.getSeatCount() ).isEqualTo( 5 );
    assertThat( carDto.getType() ).isEqualTo( "SEDAN" );
    assertThat( carDto.getListOfItems() ).isEqualTo( car.getListOfParts() );
  }


}
