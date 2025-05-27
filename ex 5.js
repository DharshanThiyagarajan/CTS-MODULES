function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const myEvent = new Event("Yoga", "2025-07-01", 20);
console.log(Object.entries(myEvent));
