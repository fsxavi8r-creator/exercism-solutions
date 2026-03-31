export const format = (name, number) => {
  const plurals = new Intl.PluralRules("en-US", { type: "ordinal" });
  const suffixes = { one: "st", two: "nd", few: "rd", other: "th" };

  function formatNumber(inputNumber) {
    const rule = plurals.select(inputNumber);
    const suffix = suffixes[rule];
    return `${number}${suffix}`;
  }
  return `${name}, you are the ${formatNumber(number)} customer we serve today. Thank you!`;
};