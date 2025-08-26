// Package weather forecasts the current weather condition of various cities in Goblinocus.
package weather

// CurrentCondition is the current condition of the city.
var CurrentCondition string
// CurrentLocation is the current location of the city.
var CurrentLocation string

// Forecast takes in the city, and condition and returns the current location, and condition as a string.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
