package tester.criteria

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/2/12
 * Time: 12:45 AM
 */

class BaseToggleFlagWrapper(toggles: Seq[TestToggleFlag], supportedToggles: Seq[TestToggleFlag]) {

  private val flags = supportedToggles
  require(!toggles.map(flags.contains(_)).contains(false)) // `flags` must contain everything in `toggles`
  // If this triggers, you likely created a new flag and forgot to add it to the implementing class's `flags`

  private val flagMap = flags map (x => (x, toggles.contains(x))) toMap

  def get(flag: TestToggleFlag) : Boolean             = flagMap(flag)
  def getAll                    : Seq[TestToggleFlag] = flagMap.filter(_._2 == true).keySet.toSeq

}
