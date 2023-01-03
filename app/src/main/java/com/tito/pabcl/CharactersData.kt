package com.tito.pabcl

import com.tito.pabcl.databinding.ItemRowGenshinBinding

object CharactersData {
    private var charactersName = arrayOf(
        "Hu Tao",
        "Ganyu",
        "Eula",
        "Jean",
        "Keqing",
        "Kokomi",
        "Nilou",
        "Raiden Shogun",
        "Yelan",
        "Yoimiya",
        "Zhongli",
        "Wanderer",
        "Itto",
        "Diluc",
        "Ayato"
    )

    private var charactersVision = arrayOf(
        "Pyro",
        "Cryo",
        "Cryo",
        "Anemo",
        "Electro",
        "Hydro",
        "Hydro",
        "Electro",
        "Hydro",
        "Pyro",
        "Geo",
        "Anemo",
        "Geo",
        "Pyro",
        "Hydro"
    )

    private var charactersWeapon = arrayOf(
        "Polearm",
        "Bow",
        "Claymore",
        "Sword",
        "Sword",
        "Catalyst",
        "Sword",
        "Polearm",
        "Bow",
        "Bow",
        "Polearm",
        "Catalyst",
        "Claymore",
        "Claymore",
        "Sword"
    )

    private var charactersDetail = arrayOf(
        "Hu Tao's antics and eccentricity belies her role as the 77th Director of the Wangsheng Funeral Parlor and her talent as a poet. " +
                "Nevertheless, she treats the parlor's operations with utmost importance, and holds funeral ceremonies with the highest dignity and solemnity.",
        "She is a half-qilin Adeptus under contract with the Geo Archon Morax and serves as the general secretary of the Liyue Qixing.",
        "Although a descendant of the infamous and tyrannical Lawrence Clan, " +
                "Eula severed her ties with the clan and became the captain of the Reconnaissance Company with the Knights of Favonius.",
        "The older sister of Barbara, and a descendant of the prestigious Gunnhildr Clan, Jean is the Acting Grand Master of the Knights of Favonius. " +
                "She is always busy handling unrest across Mondstadt and tirelessly working to maintain the City of Freedom.",
        "As the Yuheng of the Liyue Qixing, she is someone who seeks her own answers instead of idly letting chaos run amok in Liyue. " +
                "She chooses her own path with her own power and ability, instead of letting the gods determine her fate.",
        "The young Divine Priestess of Watatsumi Island and a descendant of the Sangonomiya Clan, Kokomi is in charge of most of Watatsumi's affairs, " +
                "shouldering heavy responsibilities alone in hopes for giving Watatsumi Island's people the hopes and happiness that they desire.",
        "A dancer under the Zubayr Theater, Nilou's dancing is but elegant and graceful — however, outside the stage's spotlight, " +
                "she's just like any girl her age; warm, smiling, and friendly.",
        "The Raiden Shogun is unique as she is comprised of two beings in one body: Ei, the current Electro Archon of Inazuma; " +
                "and the Shogun, the puppet created by Ei to act as the ruler of Inazuma in her stead, which also serves as her vessel.",
        "She is a mysterious person who claims to work for the Ministry of Civil Affairs, but comes out as a non-entity on their list. " +
                "She also claims to work for the Yanshang Teahouse, but only uses it for her true job, an intelligence agent collaborating with Ningguang.",
        "Yoimiya is the current owner of Naganohara Fireworks; with her colorful fireworks and outgoing personality, Yoimiya is loved by everyone on Narukami Island. " +
                "She was coined as the \"Queen of the Summer Festival,\" as they believe summer is not the same without her.",
        "A consultant of the Wangsheng Funeral Parlor, he is later revealed to be the current vessel of the Geo Archon, Morax, " +
                "who has decided to experience the world from the perspective of a mortal.",
        "The Wanderer came into existence in place of his previous incarnation after the latter expunged his previous appellations and their respective histories from Irminsul. " +
                "With his past self's memories restored within him as a form of self-inflicted sin, Wanderer is now the only title he goes by, for he has no home, no kin, and no destination.",
        "A loud and proud descendant of the crimson oni, Itto is also the leader and founder of the Arataki Gang. While not a villain, his reputation within Inazuma City leaves something to be desired, " +
                "due to him and his gang constantly getting into trouble. Nevertheless, Itto is beloved by the children, who are always excited to play street games with him.",
        "Born into the affluent Ragnvindr Clan, Diluc is the current owner of the Dawn Winery and a nobleman of high esteem in Mondstadt. " +
                "While a past incident caused him to split ways with the Knights of Favonius, he continues to protect Mondstadt in his own way.",
        "He is the current head of the Kamisato Clan, the older brother of Kamisato Ayaka, and the Yashiro Commissioner. Resourceful and cunning, " +
                "Ayato keeps a low-profile instead and focuses on government affairs in the Commission, having less of a reputation than that of his sister. His actions can be unpredictable at times, with many wondering what his plans are; nevertheless, he is a household name in Inazuma."
    )

    private var charactersPhoto = intArrayOf(
        R.drawable.hutao,
        R.drawable.ganyu,
        R.drawable.eula,
        R.drawable.jean,
        R.drawable.keqing,
        R.drawable.kokomi,
        R.drawable.nilou,
        R.drawable.raiden,
        R.drawable.yelan,
        R.drawable.yoimiya,
        R.drawable.zhongli,
        R.drawable.wanderer,
        R.drawable.itto,
        R.drawable.diluc,
        R.drawable.ayato

    )

    val listData : ArrayList<Characters>
    get() {
        val list = arrayListOf<Characters>()
        for (position in charactersName.indices){
            val characters = Characters()
            characters.name = charactersName[position]
            characters.vision = charactersVision[position]
            characters.weapon = charactersWeapon[position]
            characters.detail = charactersDetail[position]
            characters.photo = charactersPhoto[position]
            list.add(characters)
        }
        return list
    }
}