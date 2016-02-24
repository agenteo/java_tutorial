# Example of spring wiring beans

I created an automated tests to setup the context but this can also be run via the Main.

`ReservationHandler` is a class that marked as `@Component` gets autoscanned by spring.

Its dependency `ConfirmedReservationUpdater` is autowired, and within that class its dependency
`ObsoleteQuoteSpecification` is autowired.

The enty point has to be fetched from the contect with `getBean`