const eventName = "Music Night";
const eventDate = "2025-06-15";
let seats = 30;

console.log(`Event: ${eventName} | Date: ${eventDate} | Available Seats: ${seats}`);

function registerUser() {
  if (seats > 0) {
    seats--;
    console.log(`Registered successfully. Remaining seats: ${seats}`);
  } else {
    console.log("No seats available.");
  }
}
