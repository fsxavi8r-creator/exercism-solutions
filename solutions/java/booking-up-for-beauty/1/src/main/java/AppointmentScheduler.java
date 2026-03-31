import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {

/*  Implement the AppointmentScheduler.schedule() method to parse a textual
    representation of an appointment date into the corresponding LocalDateTime.
*/
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

/*  Implement the AppointmentScheduler.hasPassed() method that takes an appointment date
    and checks if the appointment was somewhere in the past
*/
    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

/*  Implement the AppointmentScheduler.isAfternoonAppointment() method that takes an
    appointment date and checks to see if the appointment is in the afternoon
    (>= 12:00 and < 18:00)
*/
    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int apptHour = appointmentDate.getHour();
        return apptHour >= 12 && apptHour < 18;
    }

/*  Implement the AppointmentScheduler.getDescription() method that takes an appointment
    date and returns a user friendly description of that date and time, in the form of:
    [Day of Week], [Month] [Day], [Year] at [Hours in 12 hour format]:[Minutes][am/pm].
*/
    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter apptFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.");
        String formattedDateTime = "You have an appointment on " + appointmentDate.format(apptFormatter);
        return formattedDateTime;
    }

/*  Implement the AppointmentScheduler.getAnniversaryDate() method that returns
    this year's anniversary date, which is September 15th
*/
    public LocalDate getAnniversaryDate() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        return LocalDate.of(year, 9, 15);
    }
}
