import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import repoDummy.BookingRepoDummy as BookingRepoDummy
import repoDummy.ScheduleRepoDummy as ScheduleRepoDummy
import services.BookingValidator as BookingValidator
import services.PriceValidator as PriceValidator

BookingRepoDummy bookingRepo = new BookingRepoDummy()

ScheduleRepoDummy scheduleRepo = new ScheduleRepoDummy()

BookingValidator bookVal = new BookingValidator()

PriceValidator priceVal = new PriceValidator()

def bookings = bookingRepo.getAllBookings()

def schedules = scheduleRepo.getAllSchedules()

println('=== BOOKINGS ===')

for (int i = 0; i < bookings.size(); i++) {
    def booking = bookings.get(i)

    println((((((((((((('id=' + booking.id) + ', bookingId=') + booking.bookingId) + ', venueId=') + booking.venueId) + 
        ', date=') + booking.date) + ', startTime=') + booking.startTime) + ', endTime=') + booking.endTime) + ', price=') + 
        booking.price)
}

println('=== SCHEDULES ===')

for (int i = 0; i < schedules.size(); i++) {
    def schedule = schedules.get(i)

    println((((((((((('id=' + schedule.id) + ', venueId=') + schedule.venueId) + ', date=') + schedule.date) + ', startTime=') + 
        schedule.startTime) + ', endTime=') + schedule.endTime) + ', price=') + schedule.price)
}

List<String> errors = priceVal.validatePrice(bookings, schedules)

if (errors.size() > 0) {
    println('=== ERRORS ===')

    for (int i = 0; i < errors.size(); i++) {
        println(errors.get(i))
    }
    
    assert false : 'Price Validation Failed'
} else {
    assert true
}