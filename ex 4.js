function addEvent(events, event) {
  events.push(event);
}

function registerUser(event) {
  event.seats--;
}

function filterEventsByCategory(events, category) {
  return events.filter(e => e.category === category);
}

function categoryTracker(category) {
  let count = 0;
  return function () {
    count++;
    console.log(`${category} registrations: ${count}`);
  };
}

function dynamicSearch(events, callback) {
  return events.filter(callback);
}
