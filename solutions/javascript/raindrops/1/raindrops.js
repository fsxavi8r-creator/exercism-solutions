export const convert = (nbr) => {
  let result = "";

  if (nbr % 3 === 0) result += "Pling";
  if (nbr % 5 === 0) result += "Plang";
  if (nbr % 7 === 0) result += "Plong";

  return result || nbr.toString();
};