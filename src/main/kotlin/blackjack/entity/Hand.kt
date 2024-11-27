package blackjack.entity

class Hand(val cards: MutableList<Card> = mutableListOf()) {
    fun addCard(card: Card) {
        cards.add(card)
    }
}
