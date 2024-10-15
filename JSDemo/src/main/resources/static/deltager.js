class DeltagerManager {

    constructor(root) {
//Registrer deltager-knappen/feltet:
        this.registrerKnapp = document.querySelector(".registrering>.input>button");
        this.registrerDeltakar = document.querySelectorAll(".registrering>.input>input");
        this.visRegistrertDeltakar = document.querySelector("#registrertDeltakar");
        this.registrerteStartnummer = [];

        this.registrerKnapp.addEventListener("click", this.registrer.bind(this));

        window.onload = () => {
            this.tomInputFelta();
            this.tomInputFeltaResultater();
        }

        this.registrerDeltakar.forEach((input) => {
            input.addEventListener("input", () => {
                this.validerInputFelta(input);
           });
      });

      this.registrerDeltakar[0].addEventListener("input", () => {
        this.registrerDeltakar[0].setCustomValidity("");
        this.validerInputFelta(this.registrerDeltakar[0]);
      });

//Vis deltagere-knappen/feltet:
        this.visDeltakararKnapp = document.querySelector(".resultat>.input>button");
        this.visNedreGrense = document.querySelector("#nedregrense");
        this.visOvreGrense = document.querySelector("#ovregrense");
        this.visListe = document.querySelector(".resultat>.liste>table>tbody")
        this.ingenResultater = document.querySelector(".resultat>.liste>p")

        this.deltakarar = [];

        this.visDeltakararKnapp.addEventListener("click", this.visDeltakarar.bind(this));

}
//Registrer deltager knappen:
    validerInputFelta(input) {
        if(input.checkValidity()) {
            input.style.borderColor = "lime";
        } else {
            input.style.borderColor = "red";
        }
    }

    tomInputFelta() {
        this.registrerDeltakar[0].value = "";
        this.registrerDeltakar[1].value = "";
        this.registrerDeltakar[2].value = "";
    }

    storForbokstavDeltakar() {
        let namn = this.registrerDeltakar[1].value.trim();
        namn = namn.split(" ").map(word => word.charAt(0).toUpperCase() + word.slice(1)).join(" ");
        this.registrerDeltakar[1].value = namn;
    }

    gyldigeTeikn() {
        let gyldig = true;
        let forstFeilInput = null;

        this.registrerDeltakar.forEach((input) => {
            this.validerInputFelta(input);

            if(!input.checkValidity()) {
                gyldig = false;
                if(!forstFeilInput) {
                    forstFeilInput = input;
                }
            }
        });

        if(forstFeilInput) {
            forstFeilInput.focus();
            forstFeilInput.reportValidity();
        }
        return gyldig;
    }
    
    lagraStartnummer(startnummeret) {
        if (this.registrerteStartnummer.includes(startnummeret)) {
            return false;
        } else {
            this.registrerteStartnummer.push(startnummeret);
            return true;
        }
    }

    registrer() {
            const startnummeret = this.registrerDeltakar[0].value;
            let deltakaren = this.registrerDeltakar[1].value.trim();
            const sluttida = this.registrerDeltakar[2].value;

            if(!this.gyldigeTeikn()) {
                const errorGyldigTeikn = document.createElement('span');
                errorGyldigTeikn.textContent = `Fyll inn felta korrekt.`;
                this.visRegistrertDeltakar.innerHTML = ``;
                this.visRegistrertDeltakar.appendChild(errorGyldigTeikn);
                return;
            }
            if(!startnummeret || !deltakaren || !sluttida) {
                const errorIkkjeFyltInn = document.createElement('span');
                errorIkkjeFyltInn.textContent = `Fyll inn alle felta.`
                this.visRegistrertDeltakar.innerHTML = ``;
                this.visRegistrertDeltakar.appendChild(errorIkkjeFyltInn);
                return;
            }
            if(this.registrerteStartnummer.includes(startnummeret)) {
                this.registrerDeltakar[0].setCustomValidity(`Startnummer ${startnummeret} har allereie blitt registrert.`);
                this.registrerDeltakar[0].style.borderColor = "red";

                this.registrerDeltakar[0].reportValidity();
                this.registrerDeltakar[0].focus();
                return;
            }
            
            this.storForbokstavDeltakar();
            deltakaren = this.registrerDeltakar[1].value;

            this.lagraStartnummer(startnummeret);

            this.deltakarar.push({
                startnummer: startnummeret,
                namn: deltakaren,
                sluttid: sluttida,
            });
            const meldingRegistrertDeltakar = document.createElement('span');
            meldingRegistrertDeltakar.textContent = `Deltakar ${deltakaren} med startnummer ${startnummeret}
            blei registrert med sluttid ${sluttida}.`
            this.visRegistrertDeltakar.innerHTML = ``;
            this.visRegistrertDeltakar.appendChild(meldingRegistrertDeltakar);

            this.tomInputFelta();
            this.registrerDeltakar[0].focus();

            console.log("Startnummer:", startnummeret);
            console.log("Deltakar:", deltakaren);
            console.log("Sluttid:", sluttida);
        }

//Vis-deltagere-knappen:

    sortertSluttid() {
        const sluttida = this.registrerDeltakar[2].value;

        let sluttidSortert = this.registrerteStartnummer.sort(function(a, b) {return a - b});
        console.log(sluttidSortert);
    }
    tomInputFeltaResultater() {
        this.visNedreGrense.value = "";
        this.visOvreGrense.value = "";
    }

    tidTilSekund(tid) {
        const delar = tid.split(":");
        return (+delar[0] * 3600) + (+delar[1] * 60) + (+delar[2]);
    }

    visDeltakarar() {
        this.visListe.innerHTML = '';
        this.ingenResultater.innerHTML = '';

        const nedreGrense = this.visNedreGrense.value;
        const ovreGrense = this.visOvreGrense.value;

        let filtrerteDeltakarar = this.deltakarar;

        if(nedreGrense && ovreGrense) {
            const nedreGrenseSekund = this.tidTilSekund(nedreGrense);
            const ovreGrenseSekund = this.tidTilSekund(ovreGrense);
			//tomInputFeltaResultater();
			//Og denne litt andre plassar der det passar.
            if(nedreGrenseSekund > ovreGrenseSekund) {
                this.visOvreGrense.setCustomValidity("Øvre grense må vere større enn nedre");
                this.visOvreGrense.style.borderColor = "red";

                this.visOvreGrense.reportValidity();

                this.visOvreGrense.focus();
                return;
            } else {				
                this.visOvreGrense.setCustomValidity("");
                this.visOvreGrense.style.borderColor = "lime";
				
                filtrerteDeltakarar = filtrerteDeltakarar.filter(deltakar => {
                    return deltakar.sluttid >= nedreGrense && deltakar.sluttid <= ovreGrense;
                });
        }
    } else if(nedreGrense && !ovreGrense) {
            filtrerteDeltakarar = filtrerteDeltakarar.filter(deltakar => {
                return deltakar.sluttid >= nedreGrense;
            });
        }
        else if(ovreGrense && !nedreGrense) {
            filtrerteDeltakarar = filtrerteDeltakarar.filter(deltakar => {
                this.visOvreGrense.focus();
                return deltakar.sluttid <= ovreGrense;
            });
        }

        filtrerteDeltakarar.sort((a,b) => a.sluttid.localeCompare(b.sluttid));

        let startPlassering = this.deltakarar.length - filtrerteDeltakarar.length + 1;

        if(filtrerteDeltakarar.length === 0) {
            const errorIngenResultat = document.createElement('span');
            errorIngenResultat.textContent = "Ingen resultater";
            this.ingenResultater.innerHTML = "";
            this.ingenResultater.appendChild(errorIngenResultat);
            return;
        }
        
        filtrerteDeltakarar.forEach((deltakarar, index) => {
            const row = document.createElement('tr');
            const plasseringTd = document.createElement('td');
            const startnummerTd = document.createElement('td');
            const namnTd = document.createElement('td');
            const sluttidTd = document.createElement('td');

            plasseringTd.textContent = startPlassering + index;
            startnummerTd.textContent = deltakarar.startnummer;
            namnTd.textContent = deltakarar.namn;
            sluttidTd.textContent = deltakarar.sluttid;

            row.appendChild(plasseringTd);
            row.appendChild(startnummerTd);
            row.appendChild(namnTd);
            row.appendChild(sluttidTd);

            this.visListe.appendChild(row);
        });
    }
    
}

const rootelement = document.getElementById("root");


new DeltagerManager(rootelement);

const registreringsDetaljar = document.querySelectorAll(".liste>table>thead>tr>th");
