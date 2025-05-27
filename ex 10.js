const greet = (name = "Guest") => `Welcome, ${name}`;

const event = { name: "Seminar", date: "2025-07-10", location: "Hall A" };
const { name, date } = event;

const eventList = [{ name: "Yoga" }, { name: "Run" }];
const copiedList = [...eventList];
