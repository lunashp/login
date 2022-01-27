package kr.co.dajsoft.hell0.repository;

import kr.co.dajsoft.hell0.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
