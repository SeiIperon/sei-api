package br.gov.ro.pge.sei.api.domain.wrapper;

/*@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor*/
public class Detail {
	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
