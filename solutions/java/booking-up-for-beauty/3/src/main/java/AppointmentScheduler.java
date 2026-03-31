import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    /* Best practice to make these constants, so we don't
       have to create them more than once. 
    */
    private static final DateTimeFormatter DATE_FORMATTER = 
        DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    private static final DateTimeFormatter DESCRIPTION_FORMATTER = 
        DateTimeFormatter.ofPattern("'You have an appointment on' EEEE, MMMM d, yyyy, 'at' h:mm a.");

    /*  Implement the AppointmentScheduler.schedule() method to parse a textual
        representation of an appointment date into the corresponding LocalDateTime.
    */
    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, DATE_FORMATTER);
    }

    /*  Implement the AppointmentScheduler.hasPassed() method that takes an appointment 
        date and checks if the appointment was somewhere in the past.
    */
    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    /*  Implement the AppointmentScheduler.isAfternoonAppointment() method that takes an
        appointment date and checks to see if the appointment is in the afternoon
        (>= 12:00 and < 18:00)
    */    
    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    /*  Implement the AppointmentScheduler.getDescription() method that takes an appointment
        date and returns a user friendly description of that date and time, in the form of:
        [Day of Week], [Month] [Day], [Year] at [Hours in 12 hour format]:[Minutes][am/pm]
    */
    public String getDescription(LocalDateTime appointmentDate) {
        return appointmentDate.format(DESCRIPTION_FORMATTER);
    }

    /*  Implement the AppointmentScheduler.getAnniversaryDate() method that returns
        this year's anniversary date, which is September 15th
    */    
    public LocalDate getAnniversaryDate() {
        return LocalDate.of(Year.now().getValue(), 9, 15);
    }
}
