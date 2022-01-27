package kr.co.dajsoft.hell0;

import kr.co.dajsoft.hell0.entity.Booking;
import kr.co.dajsoft.hell0.repository.BookingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookingTest {
    @Autowired
    private BookingRepository bookingRepository;

    @Test
    public void insertBooking(){
        Booking booking = Booking.builder().booking_NAME("정효재").booking_PAYMENT("O").booking_PLACE_ADDRESS("서울시 서대문구").booking_PLACE_NAME("우리집").booking_TEAMMEMBER(11).ip("198.189").build();
        bookingRepository.save(booking);

    }
}
