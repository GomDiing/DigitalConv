package 쓰레드게임만들기;
/*
 * 게임 캐릭터를 만들기 위해 기본 클래스 정의
 * 게임 캐릭터가 가져야할 필수요소 포함
 * 상속을 주기 위해서 접근제한자는 protected (상속관계, 같은 패키지 접근 가능)
 */
abstract public class Unit {
    protected String name; // 캐릭터 이름 설정
    protected int pPower; // Physical Power (물리적인 힘)
    protected int mPower; // Magical Power (마법의 힘)
    protected double pHit; // Physical 적중률
    protected double mHit;
    protected int ultraPower; // 궁극기 (해당 캐릭터가 가진 특수 능력)
    protected int hp; // 체력
}

// 실제 구현 없고, 상속받은 클래스는 해당 메소드를 반드시 완성해야 함
// Java는 다중 사옥이 불가능하지만 Interfacefㅡㄹ 이용하여 다중 상속처럼 사용 가능
interface GameAction {
    double pAttack(); // 구현부가 없고 선언만 있음, 상속 받은 클래스가 구현해야함
    double mAttack(); // 마법 공격력
    int ultimate(); // 궁극의 기술로 입히는 공격량(?)
    // 반환 타입이 boolean인 이유는 캐릭터의 아직 살아있는 판별하기 위해서
    // 남아잇는 hp보다 daage가크면 true를 반환 (즉, 죽었다는 의미)
    boolean setDamage (double damage); // 피해를 받는양


}
