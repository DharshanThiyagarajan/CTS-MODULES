const events = [
  { name: "Yoga", seats: 10 },
  { name: "Coding Bootcamp", seats: 5 },
];

const container = document.querySelector("#eventList");

events.forEach(e => {
  const card = document.createElement("div");
  card.textContent = `${e.name} - Seats: ${e.seats}`;
  container.appendChild(card);
});
