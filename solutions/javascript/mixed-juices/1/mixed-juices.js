// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Determines how long it takes to prepare a certain juice.
 *
 * @param {string} name
 * @returns {number} time in minutes
 */
export function timeToMixJuice(name) {
  let timeInMinutes = 0.0;
  switch (name) {
    case "Pure Strawberry Joy":
      timeInMinutes = 0.5;
      break;
    case "Energizer":
    case "Green Garden":
      timeInMinutes = 1.5;
      break;
    case "Tropical Island":
      timeInMinutes = 3.0;
      break;
    case "All or Nothing":
      timeInMinutes = 5.0;
      break;
    default:
      timeInMinutes = 2.5;
      break;
  }
  return timeInMinutes;
}

/**
 * Calculates the number of limes that need to be cut
 * to reach a certain supply.
 *
 * @param {number} wedgesNeeded
 * @param {string[]} limes
 * @returns {number} number of limes cut
 */
export function limesToCut(wedgesNeeded, limes) {
  let limesCut = 0;
  let wedgesCut = 0;

  while (wedgesCut < wedgesNeeded && limesCut < limes.length) {
    const lime = limes[limesCut];
    switch (lime) {
      case "small":
        wedgesCut += 6;
        break;
      case "medium":
        wedgesCut += 8;
        break;
      case "large":
        wedgesCut += 10;
        break;
    }
    limesCut++;
  }
  return limesCut;
}

/**
 * Determines which juices still need to be prepared after the end of the shift.
 *
 * @param {number} timeLeft
 * @param {string[]} orders
 * @returns {string[]} remaining orders after the time is up
 */
export function remainingOrders(timeLeft, orders) {
  while (timeLeft > 0 && orders.length > 0) {
    // take the first element out of the array then
    // evaluate it; decrement the time left
    const nextOrder = orders.shift();
    switch (nextOrder) {
      case "Pure Strawberry Joy":
        timeLeft -= 0.5;
        break;
      case "Energizer":
      case "Green Garden":
        timeLeft -= 1.5;
        break;
      case "Tropical Island":
        timeLeft -= 3.0;
        break;
      case "All or Nothing":
        timeLeft -= 5.0;
        break;
      default:
        timeLeft -= 2.5;
        break;
    }
  }
  return orders;
}