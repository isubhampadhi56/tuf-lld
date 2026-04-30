package structural.facade;

public class MovieBookingFacade {
    private PaymentService payment;
    private SeatReservationService reservation;
    private NotificationService notification;
    private  LoyalityPointService loyality;
    private TicketService ticket;
    public MovieBookingFacade(){
        this.payment = new PaymentService();
        this.reservation = new SeatReservationService();
        this.notification = new NotificationService();
        this.loyality = new LoyalityPointService();
        this.ticket = new TicketService();
    }
    public void bookMovieTicket(String accountId,String movieId,String seatNumber,String userEmail,double amount){
        payment.makePayment(accountId,amount);
        reservation.reserveSeat(movieId,seatNumber);
        ticket.generateTicket(movieId,seatNumber);
        loyality.addPoints(accountId,50);
        notification.sendBookingConfirmation(userEmail);
        System.out.println("Movie ticket booking completed successfully!");
    }
}
