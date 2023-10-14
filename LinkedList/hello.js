(function saySorry () {
    const start = 1;
    const maxIteration = 10000;
    const timeInitial = performance.now();
    const nth = ["零", "一", "二", "三", "四", "五", "六", "七", "八", "九"];
    const nunit = ["万", "亿"].reduce((units, unitGroup) => units.concat(units.map((unit) => unit + unitGroup)), ["", "十", "百", "千"]);
    const filename = "检查书.txt";
    const sorry = [];
    for (let i = start; i < maxIteration; i++) {
        sorry.push(`对不起 第${Array.from(i.toString())
            .reverse()
            .map((digit, index) => (parseInt(digit) || (index % 4)) ? nth[parseInt(digit)] + nunit[index] : "")
            .filter((x) => x)
            .reverse()
            .join("")}遍`);
    }
    const data = sorry.join("\n");
    console.log(data);
    const blob = new Blob([data], {
        type : "text/plain"
    });
    if (window.navigator.msSaveOrOpenBlob) {
        window.navigator.msSaveBlob(blob, filename);
    } else {
        const url = window.URL.createObjectURL(blob);
        const save = document.createElement("a");
        save.href = url;
        save.style.display = "none";
        document.body.appendChild(save);
        save.download = filename;
        save.click();
        window.URL.revokeObjectURL(url);
        save.remove();
    }
    const tiemFinal = performance.now();
    console.log("took " + (tiemFinal - timeInitial) + " milliseconds.");
})();