# Gilded Rose Kata

Project source is split by step-packages for education purpose.

- original : Original source from [wouterla](https://github.com/wouterla/GildedRose). Item class has changed a little bit.
- step1 : Coverage 100% test cases.
- step2 : Refactor only GildedRose.java. Simplify conditional statement, Extract methods and constants.
- step3 : Refactor into a Proxy, State, Simple Factory pattern. 

## How to Import

This project has a eclipse project file. 
Import it manually when you want to use other IDE, code editor 

1. eclipse package(project) explorer - right click
1. Import - Existing Project into workspace
1. Select root directory - browse - select the clone directory
	> If you a download zip file, select archive file
1. next, next, next, done!

### Eclipse project properties
- Specify a jre10
- Specify a junit4 with embed in eclipse
- Project encoding is UTF-8

## Gilded Rose Requirement Specification

Gilded Rose 팀에 오신 것을 환영합니다. 여기는 Allison이라는 친절한 주인이 운영하고 있는 작은 여관이며, 도시의 중심지에 위치하고 있습니다. 우리는 또한 최고급 물건을 사거나 팔고 있습니다.

불행하게도 우리의 제품은 시간이 지남에 따라 품질이 지속적으로 떨어집니다. 우리는 우리 회사의 재고를 업데이트 하는 시스템을 가지고 있습니다. 당신의 업무는 우리가 새로운 카테고리의 아이템을 팔 수 있도록 시스템에 새로운 기능을 추가하는 것입니다.

먼저 우리 시스템을 소개하면 다음과 같습니다.

- 모든 아이템은 SellIn이라는 값을 갖고 있으며, 우리가 이 아이템을 팔아야 하는 기한을 말합니다.
- 모든 아이템은 Quality라는 값을 갖고 있으며, 이 아이템이 얼마나 가치 있는지를 나타냅니다.
- 자정이 지나면 우리의 시스템은 모든 아이템에 대해 위의 두 값을 감소시킵니다.

꽤 간단합니다. 그렇죠? 여기에 몇 가지 흥미로운 요소들이 있습니다.

- 아이템을 파는 기한이 지난 경우, 품질은 두 배로 빨리 떨어집니다.
- 아이템의 품질은 절대 음수가 되지 않습니다.
- "Aged Brie" 아이템은 시간이 지남에 따라 도리어 품질이 증가합니다.
아이템의 품질은 50보다 클 수 없습니다.
- "Sulfuras" 아이템은 전설 아이템이라, 아이템 파는 기한이나 품질이 절대 떨어지지 않습니다.
- "Backstage passees" 아이템은 aged brie아이템과 같이 품질이 도리어 증가합니다. 이 때 아이템의 품질은 아이템 파는 기한이 10일 이하로 남으면 2씩 증가하고, 5일이하로 남으면 3씩 증가하고, 콘서트가 지나면 품질은 0이 되어 버립니다.

우리는 conjured 아이템 제공자와 새롭게 계약을 체결했습니다. 다음 요구사항이 우리 시스템에 반영되어야 합니다.

- "Conjured" 아이템은 일반 아이템들 보다 품질이 두배씩 빨리 떨어집니다.

UpdateQuality 메소드는 자유롭게 변경을 하거나 새로운 코드를 추가할 수 있습니다. 여전히 올바르게 동작한다면 말이죠. 다만 Item 클래스나 그 속성들은 변경하지 마십시오. 그 코드는 저 모퉁이에 있는 고블린에게 속한 것입니다. 그는 공유 코드의 소유권이 자신에게 있다고 여겨지지 않으면, 분노해서 당신에게 한 발 쏴버릴 것입니다(만약 당신이 원한다면, UpdateQuality 메소드나 아이템의 속성을 static으로 만드는 것 정도는 할 수 있습니다. 그 정도는 우리가 당신을 보호할 것입니다).

보다 명확하게 하기 위해, 아이템의 품질이 50을 넘을 수 없다곤 했지만, "Sulfuras"아이템의 경우 전설 아이템이라 그것의 품질이 80이라면 그 값은 절대 변하지 않습니다.