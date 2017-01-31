package lila.evalCache

import org.joda.time.DateTime
import chess.format.{ FEN, Uci }

import lila.tree.Eval.{ Score }

case class EvalCacheEntry(
  _id: FEN,
  evals: List[EvalCacheEntry.Eval])

object EvalCacheEntry {

  case class Trust(value: Float) extends AnyVal

  case class Eval(
      score: Score,
      pv: List[Uci],
      nodes: Int,
      depth: Int,
      engine: String,
      by: lila.user.User.ID,
      trust: Trust,
      date: DateTime) {
  }
}