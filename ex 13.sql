SELECT e.city, AVG(f.rating) AS avg_rating
FROM Feedback f
JOIN Events e ON f.event_id = e.event_id
GROUP BY e.city;
