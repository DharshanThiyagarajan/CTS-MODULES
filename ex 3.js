const today = new Date("2025-05-27");
const events = [
  { name: "Workshop", date: new Date("2025-06-10"), seats: 10 },
  { name: "Past Event", date: new Date("2025-04-01"), seats: 5 },
];

events.forEach(event => {
  if (event.date > today && event.seats > 0) {
    console.log(`Upcoming: ${event.name}`);
  }
});

function register(event) {
  try {
    if (event.seats > 0) {
      event.seats--;
    } else {
      throw new Error("No seats available");
    }
  } catch (err) {
    console.error(err.message);
  }
}
